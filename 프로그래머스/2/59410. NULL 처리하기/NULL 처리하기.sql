SELECT ANIMAL_TYPE, 
       COALESCE(NAME, 'No name') AS NAME, 
       SEX_UPON_INTAKE 
FROM ANIMAL_INS
ORDER BY ANIMAL_ID

/*
ANIMAL_TYPE	NAME	SEX_UPON_INTAKE
Cat	Sugar	Neutered Male
Cat	Jewel	Spayed Female
Cat	Meo	Neutered Male
Dog	Harley	Spayed Female
Cat	Gia	Spayed Female
Dog	Peanutbutter	Neutered Male
Dog	Bj	Neutered Male
Cat	Tux	Neutered Male
Cat	Ariel	Spayed Female
Dog	Kia	Spayed Female
Dog	Sammy	Neutered Male
Dog	Faith	Spayed Female
Dog	Shadow	Neutered Male
Dog	Elijah	Neutered Male
Dog	Queens	Spayed Female
Dog	Puppy	Neutered Male
Dog	Happy	Neutered Male
Dog	Fuzzo	Neutered Male
Dog	Simba	Neutered Male
Dog	Baby Bear	Neutered Male
Dog	Stitch	Neutered Male
Dog	*Morado	Neutered Male
Dog	Girly Girl	Spayed Female
Dog	Honey	Spayed Female
Dog	Goofy	Neutered Male
Dog	Hugo	Neutered Male
Dog	Diablo	Neutered Male
Dog	Minnie	Spayed Female
Dog	Miller	Neutered Male
Dog	Cookie	Spayed Female
Dog	Woody	Neutered Male
Dog	Stormy	Spayed Female
Dog	No name	Spayed Female
Dog	Sniket	Neutered Male
Cat	Emily	Spayed Female
Dog	Katie	Spayed Female
Cat	Greg	Neutered Male
Dog	Ceballo	Neutered Male
Dog	Sailor	Neutered Male
Dog	April	Spayed Female
Cat	Ella	Spayed Female
Dog	Rosie	Spayed Female
Dog	Dash	Neutered Male
Dog	Mama Dog	Spayed Female
Dog	Dora	Spayed Female
Dog	Lucy	Spayed Female
Dog	Frijolito	Neutered Male
Dog	Lyla	Intact Female
Dog	Zoe	Spayed Female
Dog	Mercedes	Spayed Female
Dog	Disciple	Intact Male
Dog	Pickle	Spayed Female
Dog	Scooby	Neutered Male
Dog	Laika	Spayed Female
Dog	Ruby	Spayed Female
Dog	Pepper	Spayed Female
Dog	Cherokee	Neutered Male
Dog	Maxwell 2	Intact Male
Dog	Princess	Spayed Female
Cat	Oreo	Neutered Male
Dog	Finney	Neutered Male
Cat	Jj	Neutered Male
Cat	Jedi	Neutered Male
Dog	Clyde	Neutered Male
Dog	Giovanni	Neutered Male
Cat	Tiko	Neutered Male
Dog	Punch	Neutered Male
Dog	Goldie	Spayed Female
Dog	Dakota	Spayed Female
Dog	Spider	Neutered Male
Dog	Blaze	Neutered Male
Dog	Holly	Spayed Female
Dog	Rome	Neutered Male
Dog	Nellie	Spayed Female
Dog	Penny	Spayed Female
Dog	Skips	Neutered Male
Dog	Chip	Neutered Male
Dog	Snickerdoodl	Spayed Female
Dog	Rogan	Neutered Male
Dog	Raven	Spayed Female
Dog	Charlie	Neutered Male
Dog	Lucy	Spayed Female
Dog	Jack	Neutered Male
Dog	Reggie	Neutered Male
Dog	Lucy	Spayed Female
Dog	Anna	Spayed Female
Dog	Kaila	Spayed Female
Dog	Sabrina	Spayed Female
Dog	Jake	Neutered Male
Dog	Lizzie	Spayed Female
Dog	Stanley	Neutered Male
Dog	Chewy	Intact Female
Cat	Raven	Spayed Female
Cat	Mitty	Spayed Female
Dog	Jimminee	Neutered Male
Dog	*Sam	Neutered Male
Dog	Jackie	Neutered Male
Dog	Benji	Spayed Female
Dog	Shelly	Spayed Female
Dog	Rocky	Neutered Male
*/