function getAdmins(map){
    let admins = [];
    for([key, value] of map){
        if(value=='Admin')
            admins.push(key);
    }
    return admins;
}

const usuarios = new Map();

usuarios.set('Sérgio', 'Admin');
usuarios.set('Diana', 'Admin');
usuarios.set('Carlos', 'User');
usuarios.set('Ana', 'Admin');

console.log(getAdmins(usuarios));