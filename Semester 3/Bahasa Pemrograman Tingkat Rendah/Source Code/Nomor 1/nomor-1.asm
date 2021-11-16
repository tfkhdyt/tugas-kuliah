.MODEL SMALL
.CODE
ORG 100h
Proses :
    MOV AH,02h
    MOV DL,'A' 
    MOV CX,5   
Ulang:
    INT 21h   
    LOOP Ulang
    INT 20h
END Proses