import api from "../api";

export default function postActors(actorName: any): Promise<any> {

    return new Promise((resolve, reject) => {
        api.post("/api/ator", { name: actorName }).then((res: any) => {
            resolve(res.data)
        });
    })
}
