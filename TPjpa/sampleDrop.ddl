ALTER TABLE CHIEN DROP CONSTRAINT FK_CHIEN_ID_CHENIL
ALTER TABLE CHIEN DROP CONSTRAINT FK_CHIEN_ID_PROP
ALTER TABLE PATHOLOGIE_CHIEN DROP CONSTRAINT FK_PATHOLOGIE_CHIEN_ID_CHIEN
ALTER TABLE PATHOLOGIE_CHIEN DROP CONSTRAINT FK_PATHOLOGIE_CHIEN_NOM_PATHOLOGIE
DROP TABLE PERSONNE CASCADE
DROP TABLE CHIEN CASCADE
DROP TABLE CHENIL CASCADE
DROP TABLE PATHOLOGIE CASCADE
DROP TABLE PATHOLOGIE_CHIEN CASCADE
DELETE FROM SEQUENCE WHERE SEQ_NAME = 'SEQ_GEN'