# SI_2023_lab2_216068

# Aleksandra Nastoska 216068
# ![Screenshot 2023-05-27 131233](https://github.com/aleksandranastoska/SI_2023_lab2_216068/assets/92433336/c1cecbc5-2f18-4354-9270-26e57fef7322)

# Со пребројување на регионите на графот, може да видиме дека има 10 внатрешни региони. На нив го додаваме целиот надворешен регион и доаѓаме до бројка 11.
# CFG=11

# EVERY BRANCH
# ![Screenshot 2023-05-29 172919](https://github.com/aleksandranastoska/SI_2023_lab2_216068/assets/92433336/1ca187aa-7f7c-4baf-8333-3b0c7f10788b)


# Прв пример е user=null
# Втор тест пример е username="user", email="user@mail.com", pass="abcd efgh", allUsers може да биде било што бидејќи целта на овој тест пример е да се покрие случајот кога имаме празно место во password
# Трет тест пример е username=null, email=user, password=user. Овој тест пример ги покрива ребрата 3-4 и 4-5,6. Освен тоа, ги покрива и ребрата 14,15-16 и 16-23
# Четврт тест пример е username="user", email="user@mail.com", password="abcdefghi*". Во allUsers имаме allUsers=(User1("user", "abcd@mail.com", ""), User2("user@mail.com", "user@mail.com", "xyz")). Со овој тест пример се покриваат случаите кога во password имаме специјален знак. 
# Последниот тест пример е username="user", password="abcdefgh", email="user". Овој тест пример го покрива случајот кога во password нема специјален знак, се поминува цела итерација на циклусот и од јазол 19.2 се оди во јазол 22, па од таму во крајниот јазол 23


# MULTIPLE CONDITION
# ![Screenshot 2023-05-27 152457](https://github.com/aleksandranastoska/SI_2023_lab2_216068/assets/92433336/10d3e10d-ea3e-44e6-a112-2e327a32f588)


# Ако user==null, не се разгледуваат останатите два услови и се влегува во if циклусот. Условот враќа Т
# Ако user.getPasswork()==null && user!=null, се влегува во циклусот и враќа Т
# Aко user!=null && user.getPassword()!=null && user.getEmail()==null, се враќа Т и повторно влегува во циклусот
# Ako user!=null && user.getPassword()!=null && user.getEmail()!=null, враќа F и не е исполнет условот

# Тестови
# ![Screenshot 2023-05-29 220719](https://github.com/aleksandranastoska/SI_2023_lab2_216068/assets/92433336/e4f85686-934c-4142-b6e0-ffef17ff95b9)

