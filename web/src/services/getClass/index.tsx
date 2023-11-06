import api from "../api";

export default function getClass(): Promise<any> {

    return new Promise((resolve) => {
        api.get("/api/classe").then((res:any) => {
            console.log(res.data);
            resolve(res.data)
        });
    })
}
