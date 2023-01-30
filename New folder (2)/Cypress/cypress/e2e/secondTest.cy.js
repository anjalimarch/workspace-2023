describe("Suite",function(){

it("first Test ",function(){

cy.visit("https://opensource-demo.orangehrmlive.com/");
cy.title().should('eq','OrangeHRM');


})

it("first Test ",function(){

    cy.visit("https://opensource-demo.orangehrmlive.com/");
 
    cy.title().should('eq','OrangeHRM123');
    
    })





})