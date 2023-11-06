import api from "../api";

export default function deleteActors(idActor: any): Promise<any> {

    return new Promise((resolve) => {
        api.delete("/api/ator/" + idActor).then((res: any) => {
            console.log(res);
            resolve(res.data);
        });
    })

}
