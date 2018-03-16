Домашнее задание для Leroy

Разработайте и реализируйте объектно-ориентированную программу, описывающую систему расчета заработной платы сотрудников.

Рассмотрим следующую (упрощенную) ситуацию.
Сотрудники компании классифицируются на полный рабочий день и неполный рабочий день. Сотрудники не полного рабочего дня получают еженедельную заработную плату в зависимости от количества проработанных дней и не имеют права на отпускную оплату.

Работникам полного рабочего дня разрешены отпуска по фиксированной ставке в год (с учетом продолжительности работы) и выплачивается ежемесячная зарплата. Право на отпуск составляет 20 дней плюс один дополнительный день за 3 года работы. (В праздники предоставляется законное право на отпуск отдельно, поскольку в эти периоды компания просто «закрыта»).

Начисление заработной платы производится раз в неделю, программа создает чек об оплате тоже раз в неделю только для тех работников у которых дата начисления приходится на эту неделю. Ежемесячные работники получают зарплату в лунные месяцы (каждые четыре недели). Еженедельные оплачиваемые работники оплачиваются каждую неделю. Поэтому оплата ежемесячно оплачиваемых работников происходит каждую четвертую «неделю оплаты». 

Некоторым работникам выплачивается бонус при условии производительности. Этот бонус доступен только для сотрудников полного рабочего дня и выражается в процентах от их нормальной оплаты (это процент определяется менеджером). Менеджер также должен соглалосвать отпуска.
Сотрудник получает формы отпусков. Если эти формы подписаны менеджером, тогда отпуск согласован, и работник получает полную оплату. Формы, которые не подписываются как менеджером, так и сотрудником, возвращаются сотруднику. 

Менеджер может также подавать бонусные формы в кадровый офис. Эти формы указывают процентную ставку, выплачиваемую сотруднику. Каждая форма действительна для одного четырехнедельного периода оплаты и должна быть подптисана руководителем персонала.

Сотрудник по начислению заработной платы должен отслеживать оставшиеся дни, на которые имеет право каждый работник.

Каждую неделю сотрудник по начислению заработной платы также получает игформацию ою «отработанных днях» от персонального отдел. Они перечисляют имя, номер сотрудника и количество дней отработаных сотрудниками неполного рабочий день.

Напишите программу на Java, чтобы помочь сотруднику отвечающему за начисление зарплатыю
Основная задача программы - подготовить еженедельный платёжный лист для каждого сотрудника у которого запланирована выплатата. 

Ваша программа должна предоставить функцию, которая позволяет сотруднику создавать новые
записи сотрудников. Это будет означать, что сотрудник начисления заработной платы должен ввести тип сотрудника, соответствующую ставку оплаты и, если применимо, количество отработаных лет.

Ваша программа также должна обеспечить функцию, которая позволяет отслеживать количество отработанных часов и отпуска и размеры бонусов.

Ваша программа должна позволять печатать еженедельный отчет:
имя, адрес, номер сотрудника и еженедельная выплата. Конечно, для ежемесячно выплачиваемых работников, их оплата должна производиться только каждые четыре недели.

Вы также должны стремиться к достижению высокой степени инкапсуляции для каждого типа данных, которые вы создаете.
Вы также можете добавлять дополнительные функции в систему начисления заработной платы, если считаете нужным. 

Ваше решение должно содержать следующее.
1. Анализ и проектирование: (i) диаграмма классов, описывающая структуру классов для вашего
решения. (ii) набор сводных таблиц, описывающих поля,
конструкторы и методы для каждого класса, который вы намереваетесь создать.
2. Реализация: Распечатка исходного кода Java вашей полной программы.
То есть - каждый из классов учетной записи, класс приложения и тестовый класс.
