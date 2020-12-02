// Nodemon restarts the project when there are new changes

const app = require("express")();
const http = require("http").Server(app);
// Socket.io
const io = require("socket.io")(http);
let users = [];
// Store messages in an array
let messages = [];
// Index is going to be our ID
let index = 0;

// Eventlistener, when someone connects its gonna pass the information of that socket
io.on("connection", socket => {
    // As soon as someone logs in, we're gonna pass them a few things
    socket.emit("loggedIn", {
        users: users.map(s => s.username),
        messages: messages
    });

    socket.on("newuser", username => {
        console.log(`${username} has arrived at the party.`);
        socket.username = username;
        users.push(socket);

        // When someone new logs in, it will add it to the username list
        io.emit("userOnline", socket.username);
    });

    socket.on("msg", msg => {
        let message = {
            index: index,
            username: socket.username,
            msg: msg
        }

        messages.push(message);

        io.emit("msg", message);

        index++;
    });

    // Disconnect
    socket.on("disconnect", () => {
        console.log(`${socket.username} has left the party.`)
        io.emit("userLeft", socket.username);
        users.splice(users.indexOf(socket), 1);
    });
});

http.listen(process.env.port || 3000, () => {
    console.log("Listening on port %s", process.env.port || 3000);
})