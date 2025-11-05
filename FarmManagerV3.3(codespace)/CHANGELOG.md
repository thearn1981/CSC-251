# Farm Manager V3.2 - Changelog

## Version 3.2.1 - Codespaces Compatibility (November 5, 2025)
* Added GitHub Codespaces support with desktop environment for GUI applications
* Created devcontainer configuration with Java 17 and VNC desktop
* Added run scripts for both Linux/Mac (run.sh) and Windows (run.bat) 
* Created comprehensive README.md with Codespaces setup instructions
* Added .gitignore for cleaner repository management
* No changes to original Java code - maintaining full backward compatibility

## Version 3.2 - Previous Updates
* Creating New invoice, selecting a customer can be done by searching name or number, or if not a customer can create
* Merged Mattea's csv files that contained headers and made sure the program now skips the line upon reading and adds it upon writing back to csv.
* Had to fix a few of the text wrapping for JOptionPane when switching the UI to the UI.java