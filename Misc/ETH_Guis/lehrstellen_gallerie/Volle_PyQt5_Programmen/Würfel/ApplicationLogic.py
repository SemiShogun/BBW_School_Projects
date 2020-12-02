#
# import der PyQT Module
#
from PyQt5.QtGui import QIcon, QPixmap
from PyQt5 import QtCore, QtWidgets, uic
import PyQt5.QtWidgets 

#Import für randomzahl()
from random import randint

#
# Die Applikationsklasse mit der gesamten Logik des Programmes
#
class MWuerfel(QtWidgets.QMainWindow):

    def __init__(self):
        super(MWuerfel, self).__init__()
        #
        # Laden des im Qt-Designer erstellten GUI
        #
        uic.loadUi('Würfel.ui', self)
        #
        #Ergänzung des GUI's
        #
        self.dropDown.addItem("1")
        self.dropDown.addItem("2")
        self.dropDown.addItem("3")

        # Verbinden UI-Komponenten (Buttons, etc.) mit
        # den jeweiligen Python-Funktionen
        #
        self.dropDown.currentTextChanged.connect(self.dropDown_loeschen)
        self.btnwuerfeln.clicked.connect(self.randomwuerfel)
        
    #
    # Definition der Python-Funktionen
    #

    def dropDown_loeschen(self):
        '''
        Die Würfeln werden erstezt mit leeren schwarten um zu
        zeigen wo sie aufgezeigt werden.
        '''
        zahl = self.dropDown.currentText()
        
        if zahl == str(1):
            self.bildlabel1.setPixmap(QPixmap(''))
            self.bildlabel2.setPixmap(QPixmap('fotos/wuerfel0.jpg'))
            self.bildlabel3.setPixmap(QPixmap(''))
        elif zahl == str(2):
            self.bildlabel1.setPixmap(QPixmap('fotos/wuerfel0.jpg'))
            self.bildlabel2.setPixmap(QPixmap(''))
            self.bildlabel3.setPixmap(QPixmap('fotos/wuerfel0.jpg'))
        else:
            self.bildlabel1.setPixmap(QPixmap('fotos/wuerfel0.jpg'))
            self.bildlabel2.setPixmap(QPixmap('fotos/wuerfel0.jpg'))
            self.bildlabel3.setPixmap(QPixmap('fotos/wuerfel0.jpg'))


    def randomwuerfel(self):
        '''
        Die Zufällige Würfeln werden da generiert und mit den Fotos verbunden.
        '''
        wahl = self.dropDown.currentText()
        wuerfeln = []

        #Nur ein Zahl
        if wahl == str(1):

            #Solange es nicht ein Zahl es in den Liste 'wuerfeln' es gibt, sollte es wiederholt werden.
            while len(wuerfeln) <1:
                zahlen = randint(1,6)
                wuerfeln.append(zahlen)

            #self.bildlabel1.setPixmap(QPixmap(''))
            #zweite Feld
            if str(wuerfeln[0]) == str(1):
                self.bildlabel2.setPixmap(QPixmap('fotos/wuerfel1.jpg'))
            elif str(wuerfeln[0]) == str(2):
                self.bildlabel2.setPixmap(QPixmap('fotos/wuerfel2.jpg'))
            elif str(wuerfeln[0]) == str(3):
                self.bildlabel2.setPixmap(QPixmap('fotos/wuerfel3.jpg'))
            elif str(wuerfeln[0]) == str(4):
                self.bildlabel2.setPixmap(QPixmap('fotos/wuerfel4.jpg'))
            elif str(wuerfeln[0]) == str(5):
                self.bildlabel2.setPixmap(QPixmap('fotos/wuerfel5.jpg'))
            else:
                self.bildlabel2.setPixmap(QPixmap('fotos/wuerfel6.jpg'))
             
        #Solange es nicht zwei Zahlen es in den Liste 'wuerfeln' es gibt, sollte es wiederholt werden.
        elif wahl == str(2):
            while len(wuerfeln) <2:
                zahlen = randint(1,6)
                wuerfeln.append(zahlen)
            
            if str(wuerfeln[0]) == str(1):
                self.bildlabel1.setPixmap(QPixmap('fotos/wuerfel1.jpg'))
            elif str(wuerfeln[0]) == str(2):
                self.bildlabel1.setPixmap(QPixmap('fotos/wuerfel2.jpg'))
            elif str(wuerfeln[0]) == str(3):
                self.bildlabel1.setPixmap(QPixmap('fotos/wuerfel3.jpg'))
            elif str(wuerfeln[0]) == str(4):
                self.bildlabel1.setPixmap(QPixmap('fotos/wuerfel4.jpg'))
            elif str(wuerfeln[0]) == str(5):
                self.bildlabel1.setPixmap(QPixmap('fotos/wuerfel5.jpg'))
            else:
                self.bildlabel1.setPixmap(QPixmap('fotos/wuerfel6.jpg'))
           
            #dritte Feld 
            if str(wuerfeln[1]) == str(1):
                self.bildlabel3.setPixmap(QPixmap('fotos/wuerfel1.jpg'))
            elif str(wuerfeln[1]) == str(2):
                self.bildlabel3.setPixmap(QPixmap('fotos/wuerfel2.jpg'))
            elif str(wuerfeln[1]) == str(3):
                self.bildlabel3.setPixmap(QPixmap('fotos/wuerfel3.jpg'))
            elif str(wuerfeln[1]) == str(4):
                self.bildlabel3.setPixmap(QPixmap('fotos/wuerfel4.jpg'))
            elif str(wuerfeln[1]) == str(5):
                self.bildlabel3.setPixmap(QPixmap('fotos/wuerfel5.jpg'))
            else:
                self.bildlabel3.setPixmap(QPixmap('fotos/wuerfel6.jpg'))

        #Alle drei Zahlen
        else:
            #Solange es nicht drei Zahlen es in den Liste 'wuerfeln' es gibt, sollte es wiederholt werden.
            while len(wuerfeln) <3:
                zahlen = randint(1,6)
                wuerfeln.append(zahlen)
            #erste Feld
            if str(wuerfeln[0]) == str(1):
                self.bildlabel1.setPixmap(QPixmap('fotos/wuerfel1.jpg'))
            elif str(wuerfeln[0]) == str(2):
                self.bildlabel1.setPixmap(QPixmap('fotos/wuerfel2.jpg'))
            elif str(wuerfeln[0]) == str(3):
                self.bildlabel1.setPixmap(QPixmap('fotos/wuerfel3.jpg'))
            elif str(wuerfeln[0]) == str(4):
                self.bildlabel1.setPixmap(QPixmap('fotos/wuerfel4.jpg'))
            elif str(wuerfeln[0]) == str(5):
                self.bildlabel1.setPixmap(QPixmap('fotos/wuerfel5.jpg'))
            else:
                self.bildlabel1.setPixmap(QPixmap('fotos/wuerfel6.jpg'))
            #zweite Feld
            if str(wuerfeln[1]) == str(1):
                self.bildlabel2.setPixmap(QPixmap('fotos/wuerfel1.jpg'))
            elif str(wuerfeln[1]) == str(2):
                self.bildlabel2.setPixmap(QPixmap('fotos/wuerfel2.jpg'))
            elif str(wuerfeln[1]) == str(3):
                self.bildlabel2.setPixmap(QPixmap('fotos/wuerfel3.jpg'))
            elif str(wuerfeln[1]) == str(4):
                self.bildlabel2.setPixmap(QPixmap('fotos/wuerfel4.jpg'))
            elif str(wuerfeln[1]) == str(5):
                self.bildlabel2.setPixmap(QPixmap('fotos/wuerfel5.jpg'))
            else:
                self.bildlabel2.setPixmap(QPixmap('fotos/wuerfel6.jpg'))
            #dritte Feld
            if str(wuerfeln[2]) == str(1):
                self.bildlabel3.setPixmap(QPixmap('fotos/wuerfel1.jpg'))
            elif str(wuerfeln[2]) == str(2):
                self.bildlabel3.setPixmap(QPixmap('fotos/wuerfel2.jpg'))
            elif str(wuerfeln[2]) == str(3):
                self.bildlabel3.setPixmap(QPixmap('fotos/wuerfel3.jpg'))
            elif str(wuerfeln[2]) == str(4):
                self.bildlabel3.setPixmap(QPixmap('fotos/wuerfel4.jpg'))
            elif str(wuerfeln[2]) == str(5):
                self.bildlabel3.setPixmap(QPixmap('fotos/wuerfel5.jpg'))
            else:
                self.bildlabel3.setPixmap(QPixmap('fotos/wuerfel6.jpg'))

    def keyPressEvent(self, e):
        if e.key() == QtCore.Qt.Key_Escape:
            self.close()



if __name__ == '__main__':
    app = QtWidgets.QApplication([])
    win = MWuerfel()
    win.show()
    app.exec_()
