import api from "../api";

export default function postClass(className: any, classValue: any, returnDate: any): Promise<any> {

    return new Promise((resolve) => {
        api.post("/api/classe",
            { name: className, classValue: Number(classValue), returnDate: Number(returnDate) },
            {
                headers: {
                    'Content-Type': 'application/json',
                }
            }).then((res: any) => {
                resolve(res.data + " " + className)
            });
    })
}
