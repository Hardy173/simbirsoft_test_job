# simbirsoft_test_job
Краткие сведения:
Данное приложение создает HTML страницу по заданому шаблону, на основе .proptrties файла. 
В bd.propeties хранятся данные обо мне в виде "Ключ-значение". Рассмотрим ключи:
FIO - Фамилия Имя Отчество
DOB - Дата рождения
telefon - Телефон
email - Мой электронный адрес
skype - Логин в скайпе
target - Цель отправки резюме
experience - Опыт работы
education - Образование
plus_education - Дополнительное образование
skils - Навыки и умения
prev - Ссылка на мой GitHub

Руководство пр запуску приложения:
Для успешного запуска программы, требуется условие нахождения файла bd.properies в файле проекта.
Если программа не найдет данный файл, выполнится исключение и программа выдаст ошибку.
Если выполнены данные условия, то программа сгенерирует файл под названием index.html 
после открытия файла появится готовая страница-резюме.

Руководство пользователя:
Данная программа нужна для более быстрого и качественного создания HTML странички и нацелена на
возможность многократного создания резюме-страниц для разных пользователей, т.к. для того чтобы изменить данные
не нужно лезть в код, достаточно изменить их в файле bd.properies.
Если при запуске программы появилась ошибка "ОШИБКА: Файл свойств отсуствует!", 
то требуется проверить наличие файла bd.properies в папке с проектом. Если наличие файла подтвердилось,
то нужно проверить путь к файлу в коде программы.
Если файл index.html после запуска приложения был Вами удален, то для его повторного создание требуется заново запустить приложение.


