#
# import der PyQT Module
#
from PyQt5 import QtCore, QtWidgets, uic
import PyQt5.QtWidgets 
from random import randint

#
# Definiton der globalen Variabeln (sofern welche benötigt werden)
#

Lotto = "x"

#
# Die Applikationsklasse mit der gesamten Logik des Programmes
#
class Lottozahlen_CH_EU(QtWidgets.QMainWindow):

    def __init__(self):
        super(Lottozahlen_CH_EU, self).__init__()
        #
        #
        #
        # Laden des im Qt-Designer erstellten GUI
        #
        uic.loadUi('LottoZahlen_CH_EU/Lottozahlen_CH_EU.ui', self)
        #
        #
        #
        #
        # Verbinden UI-Komponenten (Buttons, etc.) mit
        # den jeweiligen Python-Funktionen
        #
        #
        
        self.CHButton.clicked.connect(self.Ch)
        self.EUButton.clicked.connect(self.Eu)
                
        self.genButton.clicked.connect(self.get)
        
    #
    # Definition der Python-Funktionen
    #
    
    def Ch(self):
        global Lotto
        Lotto = "CH"
        print("CH")

    def Eu(self):
        global Lotto
        Lotto = "EU"
        print("EU")

    def get(self):
        if Lotto == "CH":
            self.randomZahlCH()
        elif Lotto == "EU":
            self.randomZahlEU()
        else:
            self.Zahl_1.setText("Wähle ein Modus!")
    
    def randomZahlCH(self):

        Lottozahlen = []
        while len(Lottozahlen) < 6:
            neue_zahl = randint(1, 45)
            if neue_zahl not in Lottozahlen:
                Lottozahlen.append(neue_zahl)
            
        Lottozahlen.sort()

        self.label_3.setText("CH")
        self.Zahl_1.setText(str(Lottozahlen[0]))
        self.Zahl_2.setText(str(Lottozahlen[1]))
        self.Zahl_3.setText(str(Lottozahlen[2]))
        self.Zahl_4.setText(str(Lottozahlen[3]))
        self.Zahl_5.setText(str(Lottozahlen[4]))
        self.Zahl_6.setText(str(Lottozahlen[5]))

    def randomZahlEU(self):
        
        Lottozahlen = []
        while len(Lottozahlen) < 5:
            neue_zahl = randint(1, 50)
            if neue_zahl not in Lottozahlen:
                Lottozahlen.append(neue_zahl)
            
        Lottozahlen.sort()

        self.label_3.setText("EU")
        self.Zahl_1.setText(str(Lottozahlen[0]))
        self.Zahl_2.setText(str(Lottozahlen[1]))
        self.Zahl_3.setText(str(Lottozahlen[2]))
        self.Zahl_4.setText(str(Lottozahlen[3]))
        self.Zahl_5.setText(str(Lottozahlen[4]))
        #6 feld bleibt leer
        self.Zahl_6.setText('')

    def keyPressEvent(self, e):
        if e.key() == QtCore.Qt.Key_Escape:
            self.close()

if __name__ == '__main__':
    app = QtWidgets.QApplication([])
    win = Lottozahlen_CH_EU()
    win.show()
    app.exec_()
