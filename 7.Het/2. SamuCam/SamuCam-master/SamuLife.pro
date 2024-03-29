######################################################################
# Automatically generated by qmake (3.0) P dec. 25 00:29:20 2015
######################################################################

DEFINES += LIFEOFGAME
#DEFINES += SARSA
DEFINES += Q_LOOKUP_TABLE

QT += widgets core
CONFIG += c++14
QMAKE_CXXFLAGS += -fopenmp
LIBS += -fopenmp
LIBS += `pkg-config --libs opencv`
LIBS += -L/usr/local/lib -lopencv_objdetect -lopencv_core -lopencv_imgproc -lopencv_highgui

TEMPLATE = app
TARGET = SamuCam
INCLUDEPATH += /usr/local/include/opencv2

# Input
HEADERS +=  SamuCam.h SamuBrain.h GameOfLife.h SamuLife.h SamuQl.h
SOURCES +=  SamuCam.cpp main.cpp SamuLife.cpp GameOfLife.cpp SamuBrain.cpp 
