# TrumpsWall
This program will scan the fail2ban.log and auth.log files looking for hacking/port scanning attempts. If someone gets banned, it will determine the country and compare that to a "Bad Country" settings file. Any country in that file will get the comand "sudo iptables -I INPUT 3 -s XXX.XXX.0.0/16 -j DROP"
