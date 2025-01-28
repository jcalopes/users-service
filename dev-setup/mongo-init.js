console.log("Starting db config...")

db = db.getSiblingDB("physical"); // Switch to the "physical" database
db.createCollection("users");

db.users.insertOne({
    name: "John Doe",
    email: "johndoe@example.com",
    premium: false,
    active: true
});

// Create a non-root user for this database (optional)
db.createUser({
    user: "limitedUser",
    pwd: "securePassword",
    roles: [
        { role: "readWrite", db: "physical" } // Grant readWrite permissions
    ]
});

console.log("Finishing db config...")