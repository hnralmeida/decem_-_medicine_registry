import api from "../api";

export default function deleteDirectors(idDirector: any): Promise<any> {

    return new Promise((resolve) => {

        api.delete("/api/diretor/" + idDirector).then((res: any) => {
            console.log(res);
            resolve(res.data)
        });
    })

}
