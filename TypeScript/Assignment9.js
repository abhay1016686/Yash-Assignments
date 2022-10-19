var Cone = /** @class */ (function () {
    function Cone(height, radius) {
        this.height = height;
        this.radius = radius;
    }
    Cone.prototype.getArea = function (radius, len) {
        // πr (l + r) 
        return 3.14 * radius * (len + radius);
    };
    return Cone;
}());
var Sphere = /** @class */ (function () {
    function Sphere(radius) {
        this.radius = radius;
    }
    Sphere.prototype.getArea = function (radius, width) {
        return 4 * 3.14 * radius * radius;
    };
    return Sphere;
}());
var Rectangle = /** @class */ (function () {
    function Rectangle(height, radius) {
        this.height = height;
        this.radius = radius;
    }
    Rectangle.prototype.getArea = function (radius, height) {
        return height * radius;
    };
    return Rectangle;
}());
var coneObj = new Cone(65, 30);
var sphereObj = new Sphere(65);
var rectObj = new Rectangle(65, 30);
console.log("Area of Cone is : " + coneObj.getArea(65, 30));
console.log("Area of Sphere is : " + sphereObj.getArea(65, 30));
console.log("Area of Rectangle is : " + rectObj.getArea(65, 30));
