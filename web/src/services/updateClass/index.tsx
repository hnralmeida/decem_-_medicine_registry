import api from "../api";

export default function updateClass(className: any, classValue: any, classReturn: any, classId: number): Promise<any> {

    return new Promise((resolve, reject) => {
        console.log("Update class: " + className + " " + classId);

        api.put("/api/classe/" + classId, 
        { 
            id: classId,
            name: className,
            classValue: classValue, 
            returnDate: classReturn
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
