import api from "../api";

export default function postDirectors(directorName: any): Promise<any> {

    return new Promise((resolve) => {
        resolve(directorName + ' postDirectors concluído')

        return new Promise((resolve, reject) => {
            api.post("/api/diretor", 
            { name: directorName },
            {
                headers: {
                    'Content-Type': 'application/json',
                }
            }
            ).then((res: any) => {
                resolve(res.data)
            });
        })
    })
}
