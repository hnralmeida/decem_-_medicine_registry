import api from "../api";

export default function getActors(): Promise<any> {

    return new Promise((resolve) => {
        
        api.get("/api/ator").then((res:any) => {
            console.log(res);
            resolve(res.data)
        });
    })
}
