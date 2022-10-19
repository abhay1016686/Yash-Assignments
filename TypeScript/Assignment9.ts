interface ICalArea {
    radius: number;
    height: number;
    width?:number;
    getArea:(radius: number,height:number,width?:number) => number;
}
class Cone implements ICalArea{
    height: number;
    radius: number;
    constructor(height: number, radius: number ) {
        this.height=height;
        this.radius=radius;
    }
    getArea(radius: number, len: number):number{
        // πr (l + r) 

        return 3.14*radius*(len + radius);
    }
    

}
class Sphere implements ICalArea {
    radius: number;
    height: number;
    constructor( radius: number ) {
        this.radius=radius;
    }
   
    getArea(radius: number, width: number):number{
     
        return 4*3.14*radius*radius;
    }      

}
class Rectangle implements ICalArea{
    radius: number;
    height: number;
    
    constructor(height: number, radius: number ) {
        this.height=height;
        this.radius=radius;
    }
    getArea(radius: number, height: number):number{
              return height*radius;
    }         

}

let coneObj= new Cone(65,30);
let sphereObj= new Sphere(65);
let rectObj= new Rectangle(65,30);

console.log("Area of Cone is : "+coneObj.getArea(65,30));
console.log("Area of Sphere is : "+sphereObj.getArea(65,30));
console.log("Area of Rectangle is : "+rectObj.getArea(65,30));
