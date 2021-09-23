## HAPI Struct <> Proto Conversion Tool
The purpose of this project is to implement the HAPI <> Proto converter, a library that converts between Hapi structs and Fhir protos. The Structures defined in the FHIR specification can be broadly categorized into two parts Resources and Base Types. The resources represent the medical data that is to be stored/shared. For example, a patient resource contains data related to a particular patient like their name, address, contact info, etc. Base  types define how this data is stored, for example, a string for name and date for DOB. 
The base types can be further classified into Data types and Primitive types. Primitive Types Cannot be broken down into simpler types. Therefore each Data type and Resource are ultimately a collection of primitive types. The basic idea therefore would be to break down these Resources and Data types until we reach primitive types, convert these primitive types to HAPI / FHIR form. Reconstruct the types.

### TODO's 
- Proper performance testing
-	DomainResource.Contained element -> Handled differently in Fhir protos and Hapi structs
-	XHTML type elements -> Handled differently in Fhir protos and Hapi structs
-	Extensions on Primitive types (Done manually currently) -> Will be fixed with gradle task automation
-	Resource type elements -> Handled differently in Fhir protos and Hapi structs

