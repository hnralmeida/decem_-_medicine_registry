import api from "../api";

export default function updateDirector(diretorName: any, diretorId: number): Promise<any> {

    return new Promise((resolve, reject) => {
        console.log("Update diretor: " + diretorName + " " + diretorId);

        api.put("/api/diretor/" + diretorId, 
        { 
            id: diretorId,
            name: diretorName
        },
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
