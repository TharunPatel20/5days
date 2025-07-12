import React, { useState, useEffect } from "react";
import { getPatients } from "./PatientService";
import "./App.css";
export const PatientInformation = ({ patientID }) => {
  const [patient, setPatient] = useState(null);
  useEffect(() => {
    const fetchPatient = async () => {
      const patients = await getPatients();
      const found = patients.find((p) => p.patientID === patientID);
      setPatient(found || null);
    };
    if (patientID) {
      fetchPatient();
    }
  }, [patientID]);
  return (
    <div className="patient-info-container">
      {patient ? (
        <div className="patient-card">
          <h3>Patient Details</h3>
          <p>Patient ID: {patient.patientID}</p>
          <p>Name: {patient.name}</p>
          <p>Age: {patient.age}</p>
          <p>Gender: {patient.gender}</p>
          <p>Condition: {patient.condition}</p>
          <p>Last Visit: {patient.lastVisit}</p>
        </div>
      ) : (
        <p>No patient found for ID: {patientID}</p>
      )}
    </div>
  );
};
