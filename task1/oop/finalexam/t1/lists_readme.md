# List Manipulation Program

## Overview

This Java program demonstrates a complex list manipulation task that combines integer and string lists using a predefined mapping, applies filtering rules, and removes numeric characters from the results.

## Program Description

The program performs the following operations:

1. **List Initialization**: Creates two source lists
   - `listA`: Contains integers `[4, 2, 7, 3, 6, 1, 5, 8, 10, 9]`
   - `listB`: Contains strings `["lnd", "vbq", "vsk", "lsd", "twe", "lyq", "oyu", "jom", "oay", "zjr", "zhu", "oxu"]`

2. **List Combination**: Creates `listC` by mapping elements from `listA` and `listB` using a hardcoded mapping array

3. **Filtering**: Filters `listC` based on the rule: keep elements whose index does NOT exist as a value in `listA`

4. **Character Removal**: Removes all numeric digits from the filtered results

## Algorithm Steps

### Step 1: Create Combined List (List C)
- Uses mapping indices `[5, 3, 8, 4, 7, 2, 6, 9, 11, 10]`
- For each element in `listA`, combines it with corresponding string from `listB`
- Result: `listC` contains combined strings with integers

### Step 2: Filter Based on Index Rule
- Iterates through `listC` with index `i`
- Keeps element if `i` is NOT found in `listA`
- Creates intermediate filtered list

### Step 3: Remove Numeric Characters
- Uses regular expression `\\d` to remove all digits
- Produces final clean string list

## Error Handling

### Current Implementation Issues

⚠️ **Critical Error Handling Missing**: The current code is vulnerable to `IndexOutOfBoundsException` in several scenarios:

1. **Mapping Index Out of Bounds**: If any value in `mappingIndices` exceeds the size of `listB`
2. **List Size Mismatch**: If `listA` and `mappingIndices` have different sizes
3. **Negative Index Values**: If `mappingIndices` contains negative values

### Required Error Handling Implementation

The program should include the following error handling mechanisms:

```java
// Error handling for mapping indices
for (int i = 0; i < listA.size(); i++) {
    int mappingIndex = mappingIndices.get(i);
    
    // Check if mapping index is within bounds
    if (mappingIndex < 0 || mappingIndex >= listB.size()) {
        System.err.println("❌ Error: Mapping index " + mappingIndex + 
                          " is out of bounds for listB (size: " + listB.size() + ")");
        System.err.println("   At position " + i + " in mappingIndices");
        continue; // Skip this element or handle as needed
    }
    
    int integerFromA = listA.get(i);
    String stringFromB = listB.get(mappingIndex);
    listC.add(stringFromB + integerFromA);
}
```

### Error Scenarios and Expected Behavior

#### Scenario 1: Mapping Index Exceeds List Size
**Input**: `mappingIndices = [5, 3, 8, 4, 7, 2, 6, 9, 15, 10]` (15 > listB.size())
**Expected Behavior**: 
- Program detects index 15 is out of bounds for listB (size 12)
- Displays error message: "❌ Error: Mapping index 15 is out of bounds for listB (size: 12)"
- Continues processing other valid elements

#### Scenario 2: Negative Index Values
**Input**: `mappingIndices = [5, 3, -1, 4, 7, 2, 6, 9, 11, 10]`
**Expected Behavior**:
- Program detects negative index -1
- Displays error message: "❌ Error: Mapping index -1 is out of bounds for listB (size: 12)"
- Skips the problematic element

#### Scenario 3: Empty Lists
**Input**: Empty `listA` or `listB`
**Expected Behavior**:
- Program validates list sizes before processing
- Displays appropriate error message for empty lists

### Error Handling Screenshot Requirements

**Note**: To fulfill the screenshot requirement, you need to:

1. **Modify the code** to include proper error handling as shown above
2. **Create test cases** with intentionally large values that exceed list bounds
3. **Run the program** with these test cases
4. **Capture screenshots** showing:
   - The error messages being displayed
   - The program continuing to execute (graceful degradation)
   - The final output with problematic elements handled

### Example Test Case for Screenshots

```java
// Test case with intentionally large mapping indices
List<Integer> testMappingIndices = new ArrayList<>(Arrays.asList(
    5, 3, 8, 4, 7, 2, 6, 9, 15, 20  // 15 and 20 exceed listB size
));
```

**Expected Console Output**:
```
❌ Error: Mapping index 15 is out of bounds for listB (size: 12)
   At position 8 in mappingIndices
❌ Error: Mapping index 20 is out of bounds for listB (size: 12)
   At position 9 in mappingIndices
✅ Intermediate Combined List (List C): [lyq4, lsd2, oay7, twe3, jom6, vsk1, oyu5, zjr8]
✅ Filtered List (before removing integers): [lyq4, oay7, jom6, oyu5, zjr8]
🏁 Final List (after eliminating integers): [lyq, oay, jom, oyu, zjr]
```

## Implementation Requirements

### To Complete Error Handling Implementation:

1. **Add Bounds Checking**: Validate all array/list access operations
2. **Implement Graceful Degradation**: Continue processing valid elements when errors occur
3. **Add Logging**: Provide clear error messages indicating what went wrong
4. **Test Edge Cases**: Create test cases with various boundary conditions

### Recommended Error Handling Structure:

```java
try {
    // List manipulation operations
} catch (IndexOutOfBoundsException e) {
    System.err.println("❌ Index out of bounds error: " + e.getMessage());
    // Handle error appropriately
} catch (Exception e) {
    System.err.println("❌ Unexpected error: " + e.getMessage());
    // Handle other potential errors
}
```

## Usage Instructions

1. **Compile the program**:
   ```bash
   javac Lists.java
   ```

2. **Run the program**:
   ```bash
   java Lists
   ```

3. **Expected Output** (with proper error handling):
   ```
   ✅ Intermediate Combined List (List C): [lyq4, lsd2, oay7, twe3, jom6, vsk1, oyu5, zjr8, zhu10, oxu9]
   ✅ Filtered List (before removing integers): [lyq4, oay7, jom6, oyu5, zjr8]
   🏁 Final List (after eliminating integers): [lyq, oay, jom, oyu, zjr]
   ```

## File Structure

```
project/
├── Lists.java          # Main program file
├── README.md          # This documentation
└── screenshots/       # Error handling screenshots (to be added)
```

## Author Information

- **Author**: Gemini
- **Version**: 1.2
- **Package**: `oop.finalexam.t1`

## Notes

- The program uses hardcoded data for demonstration purposes
- Error handling implementation is required for production use
- Screenshots demonstrating error scenarios need to be added to complete the documentation