# SI_2023_lab2_216068

# Aleksandra Nastoska 216068
# 
![Screenshot 2023-05-27 131233](https://github.com/aleksandranastoska/SI_2023_lab2_216068/assets/92433336/5de30f3d-ccdc-47a9-83e1-8c06a774a4fe)
# Со пребројување на регионите на графот, може да видиме дека има 10 внатрешни региони. На нив го додаваме целиот надворешен регион и доаѓаме до бројка 11.
# CFG=11

# EVERY BRANCH
# ![Screenshot 2023-05-29 172919](https://github.com/aleksandranastoska/SI_2023_lab2_216068/assets/92433336/393b2b88-b897-45f3-8c28-f90c437fd923)

# Прв пример е user=null
# Втор тест пример е username="user", email="user@mail.com", pass="abcd efgh", allUsers може да биде било што бидејќи целта на овој тест пример е да се покрие случајот кога имаме празно место во password
# Трет тест пример е username=null, email=user, password=user. Овој тест пример ги покрива ребрата 3-4 и 4-5,6. Освен тоа, ги покрива и ребрата 14,15-16 и 16-23
# Четврт тест пример е username="user", email="user@mail.com", password="abcdefghi*". Во allUsers имаме allUsers=(User1("user", "abcd@mail.com", ""), User2("user@mail.com", "user@mail.com", "xyz")). Со овој тест пример се покриваат случаите кога во password имаме специјален знак. 
# Последниот тест пример е username="user", password="abcdefgh", email="user". Овој тест пример го покрива случајот кога во password нема специјален знак, се поминува цела итерација на циклусот и од јазол 19.2 се оди во јазол 22, па од таму во крајниот јазол 23


# MULTIPLE CONDITION
# ![Screenshot 2023-05-27 152457](https://github.com/aleksandranastoska/SI_2023_lab2_216068/assets/92433336/c76e1a24-4801-4058-892a-9b1b6c3d9042)

# Ако user==null, не се разгледуваат останатите два услови и се влегува во if циклусот. Условот враќа Т
# Ако user.getPasswork()==null && user!=null, се влегува во циклусот и враќа Т
# Aко user!=null && user.getPassword()!=null && user.getEmail()==null, се враќа Т и повторно влегува во циклусот
# Ako user!=null && user.getPassword()!=null && user.getEmail()!=null, враќа F и не е исполнет условот

# Тестови
# ![Screenshot 2023-05-29 220719](https://github.com/aleksandranastoska/SI_2023_lab2_216068/assets/92433336/2df47ee5-fe92-473f-b2df-2e3faeef7392)

