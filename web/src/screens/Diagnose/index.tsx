// FUnções
import React, { useEffect, useState } from 'react';
import logo from '../../assets/em-construcao.png';

export function Diagnose() {

    const [isOpen, setIsOpen] = useState(false);
    const [symptoms, setSymptoms] = useState<any[]>([]);
    var prevSymptoms = symptoms;

    useEffect(() => {
        if (symptoms.length === 0) {
            symptoms.push("Dor de cabeça");
            symptoms.push("Dor de garganta");
            symptoms.push("Dor no corpo");
            symptoms.push("Febre");
            symptoms.push("Tosse");
            symptoms.push("Falta de ar");
            symptoms.push("Dor no peito");
            symptoms.push("Dor no estômago");
        }
    }, [symptoms]);

    return (
        <body className="App-content">
            <div className="symptons">
                <button
                    type="button"
                    onClick={() => setIsOpen(!isOpen)}
                    className="panel"
                >
                    Selecione os sintomas
                </button>
                {isOpen && (
                    <div className="symptoms-list">
                        {symptoms.map((symptom) => (
                            <label key={symptom} className="symptom">
                                <input
                                    type="checkbox"
                                    checked={symptoms.includes(symptom)}
                                    className='checkbox'
                                    onChange={() => {
                                        setSymptoms((prevSymptoms) => {
                                            return prevSymptoms.includes(symptom)
                                                ? prevSymptoms.filter((s) => s !== symptom)
                                                : [...prevSymptoms, symptom];
                                        });
                                    }}
                                />
                                {symptom}
                            </label>
                        ))}
                    </div>
                )}
            </div>
        </body>
    );
}