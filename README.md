# SI_2022_lab2_205006

2. Control Flow Graph 
Слика од CFG-то
https://www.dropbox.com/s/un0ogalytqvn4gm/CFGlab2.png?dl=0

На оваа слика јазлите се именувани и со букви
https://www.dropbox.com/s/j6ch3497fgzaby3/cfglab2xmlAnotacii.png?dl=0

3. Цикломатската комплексност на кодот е (девет)

E-N+2=32-25+2=9

E = 32 ребра; 
N = 25 јазли

P = 8 контролни јазли (условни/предикатни)
P+1=8+1=9

4. Тест случаи според критериумот Every Statement
https://www.dropbox.com/scl/fi/de55zw5i731djrsuh9361/EveryStatement.xlsx?dl=0&rlkey=5l8dxp2d3mmtt9tmyf3roqcqw

5. Тест случаи според критериумот Every Branch
https://www.dropbox.com/scl/fi/bpu61lmf8c9qeuppamt1i/EveryBranch.xlsx?dl=0&rlkey=begsyi5k92gwn8jtrawm9n8ts

7. Објаснување на напишаните unit tests
Ги проверувам 3-те тест случаи:
  - Низата е празна;
  - Низата не е празна, но нема n^2 големина (4,9,16,25...);
  - Низата не е празна и има големина n^2.
За првите два случаи проверувам дали ќе фрли Exception ист со оној кој го имам зададено во тестот, а за третиот случај го споредувам крајниот резултат од функцијата со очекувана вредност за листата (очекувана листа).
Сите тестови поминуваат.
