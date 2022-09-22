USE hospital;

INSERT INTO `hospital`.`specializations` (`id`, `name`) 
VALUES ('1', 'Anesthesiologist'),
		('2', 'Cardiologist'),
		('3', 'Surgeon'),
		('4', 'Dermatologist'),
		('5', 'Endocrinologist'),
		('6', 'Family Physician'),
		('7', 'Gastroenterologist');
        
INSERT INTO `hospital`.`hospital` (`id`, `name`,`address`)
VALUES ('1', 'St. Bartholomew''s Hospital','W Smithfield, London');

INSERT INTO `hospital`.`departments`(`id`, `name`,`hospitalId`)
VALUES ('1', 'Cardiology department'),
		('2', 'Gastroenterology department'),
		('3', 'Surgery department'),
		('4', 'Neurology department'),
		('5', 'Ophthalmology department');
    
INSERT INTO `hospital`.`diseasetypes`(`id`, `name`)
VALUES ('1', 'Infectious disease'),
		('2', 'Deficiency disease'),
		('3', 'Hereditary disease'),
		('4', 'Physiological diseases');

