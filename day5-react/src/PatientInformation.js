import React, { useState, useEffect } from 'react';
import { getPatients } from './PatientService';
import './App.css'; // Import CSS file

export const PatientInformation = ({ patientID }) => {
    const [patient, setPatient] = useState(null);
  
    // Function to retrieve patient information based on patient ID
    // use react hook to fetch patient information on ID change
        // fetch all patients and find patient by patient ID
   
  
    return (
      <div className="patient-info-container">
        {patient && (
          <div>
            {/* Display Paitient information here  */}
          </div>
        )}
      </div>
    );
};
