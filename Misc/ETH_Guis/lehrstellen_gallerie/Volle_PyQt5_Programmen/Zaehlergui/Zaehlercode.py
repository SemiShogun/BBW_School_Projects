#
# import der PyQT Module
#
from PyQt5 import QtCore, QtWidgets, uic
import PyQt5.QtWidgets 
#
# Definiton der globalen Variabeln (sofern welche benötigt werden)
#

minimum = 0
counter = 0
maximum = 50	
schrittweite = 1

#
# Die Applikationsklasse mit der gesamten Logik des Programmes
#

class Zaehlercode(QtWidgets.QMainWindow):
    def __init__(self):
        super(Zaehlercode, self).__init__()
        #
        # Laden des im Qt-Designer erstellten GUI
        #
        uic.loadUi('Zaehlergui.ui', self)

        #
        # Verbinden UI-Komponenten (Buttons, etc.) mit
        # den jeweiligen Python-Funktionen
        #

        #
        # pushbuttonadd, pushbuttonminus und pushbuttonreset sind die knöpfe
        # die im QT Designer verknüpft ist zusammen mit die drei Methoden 
        # on_plusbutton_clicked, on_minusbutton_clicked und on_resetbutton_clicked
        #
        self.pushbuttonadd.clicked.connect(self.on_plusbutton_clicked)
        self.pushbuttonminus.clicked.connect(self.on_minusbutton_clicked)
        self.pushbuttonreset.clicked.connect(self.on_resetbutton_clicked)

        # self.zaehlerbereichtext = QLineEdit(self.sliderbereich)
        # self.zaehlerschrittweitetext = QLineEdit(self.sliderschrittweite)

        #
        # zaehlerbereich ist den Slider für die Maximum Wert Einstellung.
        #
        self.zaehlerbereich.setValue(maximum)
        self.zaehlerbereich.valueChanged.connect(self.sliderbereich)

        #
        # zaehlerbereich ist den Slider für die Schrittweite Wert Einstellung.
        #
        self.zaehlerschrittweite.setValue(schrittweite)
        self.zaehlerschrittweite.valueChanged.connect(self.sliderschrittweite)

        self.show()

    def on_plusbutton_clicked(self):
        '''
        Dieses Methode definiert den "pushbuttonadd" im QT-Designer. 
        Falls den Knopf doch gedrückt ist, wird der Methode zuerst überprüfen, ob den Zahl grösser als
        den Maximum Wert ist.
        Wenn die Werte nicht übereinstimmen, wird der Counter Variabel mit den schrittweite Variabel
        addiert.  
        '''
        global counter, schrittweite, maximum, minimum
        counter = counter + schrittweite
        if (counter >= maximum):
            counter = maximum

        self.Display()

    def on_minusbutton_clicked(self):
        '''
        Dieses Methode definiert den "pushbuttonminus" im QT-Designer. 
        Falls den Knopf doch gedrückt ist, wird der Methode zuerst überprüfen, ob den Zahl momentan
        tiefer als den minimum Wert und ob den Zahl grösser als den Maximum Wert ist.
        Wenn die Werte nicht übereinstimmen, wird der Counter Variabel mit den schrittweite Variabel
        subtrahiert.  
        '''
        global counter, schrittweite, minimum
        counter = counter - schrittweite
        if (counter <= minimum):
            counter = minimum
        elif (counter > maximum):
            counter = maximum

        self.Display()

    def on_resetbutton_clicked(self):
        '''
        Dieses Methode definiert den "pushbuttonreset" im QT-Designer. 
        Falls den Knopf doch gedrückt ist, wird den Resetknopf den Counter Variabel wieder auf 0 setzen.
        '''
        global counter
        counter = 0
        self.Display()

    def Display(self):
        '''
        Dieses Methode definiert den counternumber und progressingbar Widgets im QT-Designer.
        '''
        self.counternumber.display(counter)
        self.progressingbar.setMaximum(maximum)
        self.progressingbar.setValue(counter)

    def sliderschrittweite(self):
        '''
        Dieses Methode definiert den zaehlerschrittweite Widget im QT-Designer.
        Den sliderschrittweite Methode definiert wie gross den Schrittweite sein sollte. 
        z.B falls den Slider auf 1 eingestellt ist, wird den plus und minus button den 
        Wert 1 haben, oder falls den Slider auf 5 eingestellt ist, wird den plus und minus button den Wert 5 
        haben.
        Den Sliderschrittweite geht von 1 bis zu 5.
        '''
        global schrittweite
        schrittweite = self.zaehlerschrittweite.value()
        # self.zaehlerschrittweitetext.setText(schrittweite)

    def sliderbereich(self):
        '''
        Dieses Methode definiert den zaehlerschrittweite Widget im QT-Designer.
        Den sliderschrittweite Methode definiert wie gross den Bereich sein sollte, Bereich kann auch
        als den Variabel Maximum definiert sein.
        z.B falls den Slider auf 10 eingestellt ist, wird den Maximum Wert 10 sein, oder falls den Slider
        auf 50 eingestellt ist, wird den Maximum Wert 50 sein.
        Den Sliderbereich geht von 10 bis zu 50. 
        '''
        global maximum
        maximum = self.zaehlerbereich.value()
        # self.zaehlerbereichtext.setText(maximum)

    def exit(self):
        self.close()

    def keyPressEvent(self, e):
        if e.key() == QtCore.Qt.Key_Escape:
            self.close()

if __name__ == '__main__':
    app = QtWidgets.QApplication([])
    win = Zaehlercode()
    win.setWindowTitle("Zähler")
    win.show()
    app.exec_()


