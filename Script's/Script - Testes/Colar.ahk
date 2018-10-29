::btw::By the way                          ; Replaces "btw" with "By the way" as soon as you press an EndChar.
:*:btw::By the way                         ; Replaces "btw" with "By the way" without needing an EndChar

^n::                                       ; Ctrl & n Hotkey
   run, notepad.exe                        ; Run the program notepad.exe when you press Ctrl & n
Return                                     ; This ends the hotkey. The code below this will not get triggered.

^b::                                       ; Ctrl & b Hotkey
   send, {ctrl down}c{ctrl up}             ; Copies the selected text. ^c could be used as well, but this method is moresecure.
   SendInput, [b]{ctrl down}v{ctrl up}[/b] ; Wraps the selected text in bbcode (forum) Bold tags.
Return                                     ; This ends the hotkey. The code below this point will not get triggered.

