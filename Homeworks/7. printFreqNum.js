
function frequentElem(arr){
let freqCount = 1;
let m = 0, freqMember = 0;
for (let i = 0; i < arr.length; ++i)
{
        for (let j = i; j < arr.length; ++j)
        {
                if (arr[i] == arr[j]) m++;
                if (freqCount < m)
                {
                  freqCount = m; 
                  freqMember = arr[i];
                }
        }
        m = 0;
}
console.log(`${freqMember} (${freqCount} times)`);
}

const array = [12, 54, 3, 12, 3, 12, 0, 12];
frequentElem(array);

