import api from "../api";

export default function updateActors(actorName: any, actorId: number): Promise<any> {

    return new Promise((resolve, reject) => {
        console.log("Update actor: " + actorName + " " + actorId)
        api.put("/api/ator/" + actorId, 
        { name: actorName, id: actorId },
        {
            headers: {
                'Content-Type': 'application/json',
            }
        }).then((res: any) => {
            resolve(res.data)
        }).catch((error: any) => {
            reject(error)
        });
    })
}
