import re
#match function
# words = ('book', 'bookworm', 'Bible',
# 'bookish','cookbook', 'bookstore', 'pocketbook')
# pattern = re.compile(r'book')
# for w in words:
#     if re.match(pattern,w):
#         print(f'The{w} matches')

#fullmatch function

# for w in words:
#     if re.fullmatch(pattern,w):
#         print(f'The {w} Matches')

# the search function

# for w in words:
#     if re.search(pattern,w):
#         print(f'the {w} matches')

# email address check using regex

emails = ("luke@gmail.com", "andy@yahoocom",
"34234sdfa#2345", "f344@gmail.com")
pattern = re.compile(r'^[a-zA-Z0-9._-]+@[a-zA-Z0-9-]+\.[a-zA-Z.]{2,18}$')
for e in emails:
    if re.match(pattern,e):
        print(f'{e} match')


