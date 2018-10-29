^f::
   Run,cmd.exe
   Sleep, 2000
   Send,cd\
   Send,{Enter}
   Sleep, 1000
   Send,cd autentic
   Send,{Enter}
   Sleep, 1000
   Send,fsum -md5 -rmd -r -dc:\autentic MD5.txt >c:\autentic\md5.txt
   Send,{Enter}
   Sleep, 2000
   Send,fsum -md5 -rmd -r -dc:\autentic *.*.txt>c:\autentic\relacao.txt
   Send,{Enter}
   Sleep, 10000
   Send,fsum -md5 -rmd -r -dc:\autentic relacao.txt>c:\autentic\relacao2.txt
   Send,{Enter}
Return  	