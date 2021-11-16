.model small
.stack 100h
.data
    str1 db 'Masukkan Hex Digit (A-F): $'
    str2 db 0ah,0dh,'Dalam Decimal yaitu : 1'
    ans db ?
    str3 db '$'
.code
    main proc
       mov ax,@data
       mov ds,ax
       
       mov ah,9
       lea dx,str1
       int 21h
       
       mov ah,1
       int 21h
       
       sub al,11H
       mov ans,al
       
       mov ah,9
       lea dx,str2
       int 21h
       
       mov ah,4ch
       int 21h
    main endp
end main