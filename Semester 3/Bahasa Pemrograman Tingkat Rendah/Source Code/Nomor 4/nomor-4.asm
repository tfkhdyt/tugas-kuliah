.model small
.code
org 100h
text: jmp mulai
tulis db 'TAUFIKHIDAYAT'   
len equ $ - tulis
mulai:
    xor bx,bx
    mov cx,3
ulang:
    mov dl,tulis[bx]
    mov ah,02
    int 21h   
    mov dl,0dh
    int 21h 
    mov dl,0ah
    int 21h
    add bx,6
    loop ulang
    int 20h
end text