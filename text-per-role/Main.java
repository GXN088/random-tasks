private String printTextPerRole(String[] roles, String[] textLines) {
    StringBuilder result = new StringBuilder();
    
    for (String role : roles) {
        result.append(role).append(":\n");
        String prefix = role + ":";
        
        for (int i = 0; i < textLines.length; i++) {
            if (textLines[i].startsWith(prefix)) {
                String text = textLines[i].substring(prefix.length());
                result.append(i + 1).append(")").append(text).append("\n");
            }
        }
        result.append("\n");
    }
    
    // Remove trailing newline at the very end
    if (result.length() > 0) {
        result.deleteCharAt(result.length() - 1);
    }
    
    return result.toString();
}
