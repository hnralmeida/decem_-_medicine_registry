import api from "../api";

export default function deleteClass(idClass: any): Promise<any> {

    return new Promise((resolve) => {

        api.delete("/api/classe/" + idClass).then((res: any) => {
            console.log(res);
            resolve(res.data)
        });
    })
}
