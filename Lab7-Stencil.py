from dataclasses import dataclass

# Possible bloodtypes for this lab.
BloodTypes = ["O", "A", "B", "AB"]
    
"""
    TODO: IMPLEMENT THE HEALTHRECORD CLASS:

    IN THE HEALTHRECORD CLASS:
    TODO: above_temp_for method using for loops
    TODO: above_temp_filter method using filter and lambda
    TODO: above_temp_comp method using list comprehensions
"""

# TODO: Create your two dataclasses OUTSIDE of your Visits class.
class Visit:
    def __init__(self, temp, weight, date, labs):
        self.temp = temp
        self.weight = weight
        self.date = date
        self.labs = labs
        
    def add_labs(self, report):
        """
            add_labs adds a labreport to the list that records which labs were
            executed on a certain visit

            input: lab to be added
            output: none
            TODO: implement add_labs to include checking that the report is 
            an acceptable lab type.
        """
        return 

"""
    TODO: Create a global dictionary that maps patient id to health record

    USING THE ABOVE DICTIONARY: 
    TODO: write total_blood_count using a list comprehension or filter
    TODO: write aged_blood_count using a list comprehension or filter.

    NOTE: these should be global methods.
"""
