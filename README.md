# SI_2022_lab2_205006

2. Control Flow Graph 
Слика од CFG-то

![CFGnotacii](https://user-images.githubusercontent.com/100210063/170839093-8c694ccb-11ac-477f-bb39-5c6d3efadb25.png)

https://www.dropbox.com/s/j6ch3497fgzaby3/cfglab2xmlAnotacii.png?dl=0


3. Цикломатската комплексност на кодот е (девет)

E-N+2=32-25+2=9

E = 32 ребра; 
N = 25 јазли

P = 8 контролни јазли (условни/предикатни)
P+1=8+1=9

4. Тест случаи според критериумот Every Statement

[EveryStatement.xlsx](https://github.com/Ackolakitus/SI_2022_lab2_205006/files/8791670/EveryStatement.xlsx)


5. Тест случаи според критериумот Every Branch

[EveryBranch.xlsx](https://github.com/Ackolakitus/SI_2022_lab2_205006/files/8791671/EveryBranch.xlsx)


7. Објаснување на напишаните unit tests
Ги проверувам 3-те тест случаи:
  - Листата е празна;
  - Листата не е празна, но нема n^2 големина (4,9,16,25...);
  - Листата не е празна и има големина n^2.
За првите два случаи проверувам дали ќе фрли Exception ист со оној кој го имам зададено во тестот, а за третиот случај го споредувам крајниот резултат од функцијата со очекувана вредност за листата (очекувана листа).
Сите тестови поминуваат.
