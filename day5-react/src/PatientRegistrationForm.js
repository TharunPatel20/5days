import React, { useState, useEffect } from 'react';
import { addPatient } from './PatientService';
import './App.css'; // Import CSS file

// Patient registration form component
const PatientRegistrationForm = ({ onRegister }) => {
    const [errors, setErrors] = useState({});

  const [formData, setFormData] = useState({
    name: '',
    age: '',
    gender: '',
    condition: '',
    lastVisit: '',
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData({ ...formData, [name]: value });
  };
  const validateForm = () => {
    const errors = {};

    // validate form and return errors 
  };

  const isValidDate = (dateString) => {
//    validate date 
  };
  const handleSubmit = async (e) => {
    e.preventDefault();
    // Call parent function to register patient and validate form 

  };

  return (
    <div>

    {/* create patient form */}
  </div>

  );
};
export default PatientRegistrationForm;
