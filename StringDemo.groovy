
def message = 'Hello'
println message.class

def text = "$message Friend"
println text.class
println text

def s1 = '''
First
Second
'''

println s1

def s2 = """
First
$message
Third
"""

println s2

