.MODEL SMALL
.CODE
ORG 100h
Proses:
    MOV AH,02h
    MOV DL,'A'
    MOV CX,5h
Ulang:
    INT 21h
    INC DL
    LOOP Ulang
    INT 20h
END Proses