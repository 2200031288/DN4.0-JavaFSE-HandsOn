CREATE OR REPLACE PROCEDURE calculate_bonus (
    p_salary IN NUMBER,
    p_bonus OUT NUMBER
)
AS
BEGIN
    p_bonus := p_salary * 0.1;
END;
/
-- Usage
DECLARE
    bonus NUMBER;
BEGIN
    calculate_bonus(50000, bonus);
    DBMS_OUTPUT.PUT_LINE('Bonus: ' || bonus);
END;
/
