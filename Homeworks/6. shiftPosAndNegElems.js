
function shiftElems(arr, length)
{
    let j = 0;
    for (let i = 0; i < length; ++i) {
        if (arr[i] >= 0) {
            if (i != j){
               [arr[i], arr[j]] = [arr[j], arr[i]];
            }
            j++;
        }
    }
}

const array = [-45, -5, -12, 547, 6, 7, -2];
shiftElems(array, array.length); console.log(array);