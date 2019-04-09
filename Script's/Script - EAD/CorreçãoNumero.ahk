^o::
Loop, 165
{
	Send,{Enter}
	Loop, 4
	{
		Send,{Left}
	}
	Send,{BS}
	Send,{Space}
	Loop, 7
	{
		Send,{Left}
	}
	Send,{BS}
	Loop, 2
	{
		Send,{Left}
	}
	Send,{BS}
	Send,0
	Send,{Enter}
	Sleep, 1000
}
Return