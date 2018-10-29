; This is how you hold 1 key down and press another key (or keys).
; If 1 method doesn't work in your program, please try the other.
^UP::
send, ^s                     ; Both of these send CTRL+s
send, {ctrl down}s{ctrl up}  ; Both of these send CTRL+s
Send, {ctrl down}c{ctrl up}
Send, {b down}{b up}
Send, {TAB down}{TAB up}
Send, {Up down}  ; Press down the up-arrow key.
Sleep, 1000      ; Keep it down for one second.
Send, {Up up}    ; Release the up-arrow key.

