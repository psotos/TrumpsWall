# TrumpsWall
This program will scan the fail2ban.log and auth.log files looking for hacking/port scanning attempts. If someone gets banned, or a port scan is detected, the program will determine the country code of the attacker using https://www.abuseipdb.com/check/xxx.xxx.xxx.xxx and compare that to a "Bad Country" settings file. Any country code in that file will get the command "sudo iptables -I INPUT 3 -s xxx.xxx.0.0/16 -j DROP" run on that IP. If the country code is not in that file then it will simply do a normal drop on the IP running this command: "sudo iptables -I INPUT 3 -s xxx.xxx.xxx.xxx -j DROP". This essentailly sets up a permanent banning of hacker ips if you are using iptables-save/restore.

In order for this strategy to work you must be running fail2ban. See installation instructions here:
http://www.fail2ban.org/wiki/index.php/Main_Page

Also, you may want to consider auto-saving and renewing your iptables rules on boot by using the iptables strategy referenced here:
https://help.ubuntu.com/community/IptablesHowTo
