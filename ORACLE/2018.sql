# Lister les départements avec leurs régions respectives;
SELECT D.departement_name AS "Département", R.region_name AS "Region"
FROM DEPARTEMENTS D
JOIN LOCATIONS L ON D.location_id = L.location_id
JOIN COUNTRIES C ON L.country_id = C.country_id
JOIN REGIONS R ON C.region_id = R.region_id;

SELECT E.first_name, E.last_name, E.phone_number, D.department_name
FROM EMPLOYEES E
JOIN DEPARTMENTS D ON E.department_id = D.department;

SELECT region_name
FROM REGIONS
ORDER BY region_name ASC;

SELECT D.departement_name AS "Département", L.street_adress AS "Localité"
FROM DEPARTEMENTS D
JOIN LOCATIONS L ON D.location_id = L.location_id


# liste respectivement les employees
# lister les noms des employers par ordre croissant selon employee_id
# lister tout les requêtes de ces deux tableaux employees et départements
# lister les numéros, les noms des employers, leurs managers respectifs, leurs départements associés. Et de plus, la requête affche les numéros locaux et leurs pays